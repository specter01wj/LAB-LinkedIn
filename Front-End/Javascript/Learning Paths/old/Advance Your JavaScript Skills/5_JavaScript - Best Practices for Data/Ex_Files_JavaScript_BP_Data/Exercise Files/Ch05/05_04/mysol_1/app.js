'use strict';

const data = {
  warning: true,
  warningText: 'Solar flare may disrupt communications',
};
/* const warning = data.warning ? true : false;

console.log(`Warning: ${(warning) ? data.warningText : 'No warning message at this time'}`); */

const nullWarning = 'No warning message at this time';
const warning = data.warning;
const text = data.warningText;

console.log(`Warning: ${(warning) ? text : nullWarning}`);

