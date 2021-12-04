let todo = require('./todo.js');
console.log("todo:::::",todo);
todo.addTask('call','call vinayak asap');
todo.addTask('check','please check the passbook');
todo.addTask('print','print the passbook');
/*todo.addTask('call','call vinayak asap');*/
//todo.searchTask('call');
todo.deleteTask('print');
todo.showAllTask();
todo.updateTask('call',null,'call mayur asap');
todo.updateTask('call','callBack',null);
console.log("after update arrya is ::::::");
console.log("after update arrya is :::::::::");
todo.showAllTask();