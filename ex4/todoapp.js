const express = require('express');
const bodyParser = require('body-parser');
const fs = require('fs');
let app = express();
app.use(bodyParser.json());

function readJsonFile() {
    let jsonFile = fs.readFileSync('tasks.json', 'utf-8', (err) => {
        if (err){
            console.log("File reading failed");
            throw err;
        }
    });
    return jsonFile;
}

function writeToJson(file){
    let jsonString = JSON.stringify(file, null, 4);
    fs.writeFile('tasks.json', jsonString, (err) => {
        if (err) {
            console.log("Error writing file", err);
            throw err;
        } else {
            console.log("Successfully wrote file");
        }
    });
}

app.get('/tasks', (req, res) => {
    res.send(readJsonFile());
    console.log("Show all task in tasks.js ");
});

app.get('/tasks/new',(req, res) => {
    let tasksList = JSON.parse(readJsonFile());
    let id = req.query.id || "NaN";
    let taskDescription = req.query.task || "Null";

    if(isNaN(id)){
        res.send("You enter invalid ID number");
    } else {
        if(!tasksList.hasOwnProperty(id)){
            tasksList[id] = taskDescription; 
            writeToJson(tasksList);
            console.log("Added the " + id +"'th task to your TODO list");
            res.send("Added new task \n id: " + id + "\n task: " + taskDescription);
        } else {
            res.send("The ID is already exists, please choose another one");
        }  
    }
});

app.get('/tasks/remove',(req, res) => {
    
    let tasksList = JSON.parse(readJsonFile());
    let id = req.query.id;

    if(isNaN(id)){ //There is no ID number
        res.send("You enter invalid ID number");
    } else {
        if(tasksList.hasOwnProperty(id)){ 
            delete tasksList[id]; 
            console.log("Delete task number " + id + " from your TO DO list");
            res.send("Delete the task with id: " + id + " from JSON file");
            writeToJson(tasksList);
        } else {
            res.send("The ID is not exists, please choose another one");
        }
    }
});

app.listen(3000,() => {
  console.log('Listening on port 3000!')});

