//var course = new Object();

function Course(title, instr, lv, pub, views) {
    this.title = title;
    this.instr = instr;
    this.lv = lv;
    this.pub = pub;
    this.views = views;
    this.updateViews = function() {
	    	++this.lv;
	        ++this.views;
        return true;
    }
}


var newCourse1 = new Course('FPGA', 'Lee', 10, true, 101);

console.log(newCourse1);
console.log(newCourse1.lv);
console.log(newCourse1.views);

newCourse1.updateViews();
newCourse1.updateViews();

console.log(newCourse1);
