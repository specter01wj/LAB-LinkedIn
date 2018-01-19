
var course = new Object();


course = {
	title: 'FPGA',
	instr: 'LEE',
	lv: 23,
	pub: true,
	views: 2300,
	updateView: function() {
		return ++course.views;
	}
};


course.title = 'DSP';
console.log(course);

course.updateView();
console.log(course.views);

