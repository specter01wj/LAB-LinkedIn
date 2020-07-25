'use strict';

const data = {
  tempC: '24',
  conditions: 'windy',
  alert: '2',
};

let alert = false;
/* if ('1' === data.alert) {
  alert = 'winter storm';
} else if ('2' === data.alert) {
  alert = 'high wind';
} else if ('3' === data.alert) {
  alert = 'hurricane';
} else if ('4' === data.alert) {
  alert = 'heat advisory';
}  */
if (data.alert === '1') {
  alert = 'winter storm';
} else if (data.alert === '2') {
  alert = 'high wind';
} else if (data.alert === '3') {
  alert = 'hurricane';
} else if (data.alert === '4') {
  alert = 'heat advisory';
} 

if (alert) {
  console.log(`Alert: ${alert}`);
}