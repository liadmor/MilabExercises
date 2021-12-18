function task(name,desc){
	this.id = new Date().getTime();
	this.name = name;
	this.desc = desc;
	this.subTask = [];
}
module.exports = task;
