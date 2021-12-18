let taskStroage = [];
let task = require('./task.js');
exports.addTask = function(name,desc){
	let t = new task(name,desc);
	console.log("task creation done:: \n");
	console.log("t obj contain :::", t ,'\n');
	taskStroage.push(t);
	console.log("push done \n");
	console.log("object in task taskStroage \n",taskStroage,"\n");
}
exports.searchTask = function(name){
	let idx;
	taskStroage.map(function(task,index){
		if(task.name === name){
			console.log('task name::',task.name);
			console.log('task desc::',task.desc);
		}
	})
}
exports.deleteTask = function(name){
	let idx;
	taskStroage.map(function(task,index){
    	if(task.name === name){
        	idx = index;
        	console.log("this task going to delete \n");
        	console.log('task id ::', task.id);
        	console.log('task name ::', task.name);
        	console.log('task desc ::', task.desc);
        	console.log("index of taskStroage to be delete::",idx,"\n");
        }
	})
	taskStroage.splice(idx);
	console.log(" task deletetion done:: \n");
}
exports.updateTask = function(name, newName, newDesc){
	taskStroage.map(function(task,index){
		if (task.name == name) {
        	console.log("this task going to update \n");
        	console.log('task id ::', task.id);
        	console.log('task name ::', task.name);
        	console.log('task desc ::', task.desc);
        	if(newName){
        		task.name = newName;
        	}
        	if(newDesc){
        		task.desc = newDesc;
        	}
        	console.log("update opration done:::");
		}
	})
}
exports.showAllTask = function(task, index){
	console.log("full task list:::", taskStroage);
}