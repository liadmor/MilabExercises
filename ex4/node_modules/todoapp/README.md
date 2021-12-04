# todoTaskApp
=========

A small library that adds todo task

## Installation

  `npm install @phutaneVinayak/todoTask`

## Usage

  `let todo = require('./todo.js');
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
  todo.showAllTask();`

## Output
  `D:\node practice\todoNodeMudule>node index
todo::::: { addTask: [Function],
  searchTask: [Function],
  deleteTask: [Function],
  updateTask: [Function],
  showAllTask: [Function] }
task creation done::

t obj contain ::: task { id: 1488525793303, name: 'call', desc: 'call vinayak asap' }

push done

object in task taskStroage
 [ task { id: 1488525793303, name: 'call', desc: 'call vinayak asap' } ]

task creation done::

t obj contain ::: task {
  id: 1488525793303,
  name: 'check',
  desc: 'please check the passbook' }

push done

object in task taskStroage
 [ task { id: 1488525793303, name: 'call', desc: 'call vinayak asap' },
  task {
    id: 1488525793303,
    name: 'check',
    desc: 'please check the passbook' } ]

task creation done::

t obj contain ::: task { id: 1488525793303, name: 'print', desc: 'print the passbook' }

push done

object in task taskStroage
 [ task { id: 1488525793303, name: 'call', desc: 'call vinayak asap' },
  task {
    id: 1488525793303,
    name: 'check',
    desc: 'please check the passbook' },
  task { id: 1488525793303, name: 'print', desc: 'print the passbook' } ]

this task going to delete

task id :: 1488525793303
task name :: print
task desc :: print the passbook
index of taskStroage to be delete:: 2

 task deletetion done::

full task list::: [ task { id: 1488525793303, name: 'call', desc: 'call vinayak asap' },
  task {
    id: 1488525793303,
    name: 'check',
    desc: 'please check the passbook' } ]
this task going to update

task id :: 1488525793303
task name :: call
task desc :: call vinayak asap
update opration done:::
after update arrya is ::::::
full task list::: [ task { id: 1488525793303, name: 'call', desc: 'call mayur asap' },
  task {
    id: 1488525793303,
    name: 'check',
    desc: 'please check the passbook' } ]

D:\node practice\todoNodeMudule>node index
todo::::: { addTask: [Function],
  searchTask: [Function],
  deleteTask: [Function],
  updateTask: [Function],
  showAllTask: [Function] }
task creation done::

t obj contain ::: task { id: 1488525834985, name: 'call', desc: 'call vinayak asap' }

push done

object in task taskStroage
 [ task { id: 1488525834985, name: 'call', desc: 'call vinayak asap' } ]

task creation done::

t obj contain ::: task {
  id: 1488525834985,
  name: 'check',
  desc: 'please check the passbook' }

push done

object in task taskStroage
 [ task { id: 1488525834985, name: 'call', desc: 'call vinayak asap' },
  task {
    id: 1488525834985,
    name: 'check',
    desc: 'please check the passbook' } ]

task creation done::

t obj contain ::: task { id: 1488525834985, name: 'print', desc: 'print the passbook' }

push done

object in task taskStroage
 [ task { id: 1488525834985, name: 'call', desc: 'call vinayak asap' },
  task {
    id: 1488525834985,
    name: 'check',
    desc: 'please check the passbook' },
  task { id: 1488525834985, name: 'print', desc: 'print the passbook' } ]

this task going to delete

task id :: 1488525834985
task name :: print
task desc :: print the passbook
index of taskStroage to be delete:: 2

 task deletetion done::

full task list::: [ task { id: 1488525834985, name: 'call', desc: 'call vinayak asap' },
  task {
    id: 1488525834985,
    name: 'check',
    desc: 'please check the passbook' } ]
this task going to update

task id :: 1488525834985
task name :: call
task desc :: call vinayak asap
update opration done:::
this task going to update

task id :: 1488525834985
task name :: call
task desc :: call mayur asap
update opration done:::
after update arrya is ::::::
full task list::: [ task { id: 1488525834985, name: 'callBack', desc: 'call mayur asap' },
  task {
    id: 1488525834985,
    name: 'check',
    desc: 'please check the passbook' } ]`

## Tests

  `npm todo`

## Contributing
  `this is my first app ---vinayak vishwanath phutane`
