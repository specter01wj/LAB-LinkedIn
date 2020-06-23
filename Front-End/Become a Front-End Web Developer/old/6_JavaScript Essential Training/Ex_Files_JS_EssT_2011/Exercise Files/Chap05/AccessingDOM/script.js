var mainTitle = document.getElementById('mainTitle');

console.log('elem type: ' + mainTitle.nodeType);
console.log('inner html: ' + mainTitle.innerHTML);
console.log('child nodes: ' + mainTitle.childNodes.length);

var myLinks = document.getElementsByTagName('a');

console.log('links: ' + myLinks.length);

