class LinkedList {
  constructor() {
    this.data = 0;
    this.next = null;
  }
}

function listItem(data) {
  let temp = new LinkedList();
  temp.data = data;
  temp.next = null;
  return temp;
}

let trackingPosition = 0;
let midPoint = null;

function findMidPoint(head) {
  if (head === null) {
    trackingPosition = trackingPosition / 2;
    return;
  }

  trackingPosition++;

  findMidPoint(head.next);

  trackingPosition--;

  if (trackingPosition === 0) {
    midPoint = head;
  }
}

function midPointTrack(head) {
  midPoint = null;
  trackingPosition = 1;
  findMidPoint(head);
  return midPoint;
}

let head = listItem(16);
head.next = listItem(7);
head.next.next = listItem(3);
head.next.next.next = listItem(4);
head.next.next.next.next = listItem(9);

let midPointResult = midPointTrack(head);

console.log(midPointResult);
