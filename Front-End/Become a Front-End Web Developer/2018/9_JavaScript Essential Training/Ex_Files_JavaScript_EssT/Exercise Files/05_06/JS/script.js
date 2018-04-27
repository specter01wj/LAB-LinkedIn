
const FEATURED = document.querySelector('.story-wrapper');
const THEIMAGE = FEATURED.querySelector('img');

var altText = THEIMAGE.getAttribute('alt');

var captionEle = document.createElement('figcaption');

//captionEle.append(altText);
//FEATURED.append(captionEle);

var captionText = document.createTextNode(altText);

captionEle.appendChild(captionText);

FEATURED.appendChild(captionEle);

THEIMAGE.setAttribute('alt','');

