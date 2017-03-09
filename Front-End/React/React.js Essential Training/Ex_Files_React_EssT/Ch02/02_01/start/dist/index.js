const { createElement } = React
const { render } = ReactDOM

const title = createElement(
  'h1',
  {id: 'title', className: 'header'},
  'James Wang'
)

render(
  title,
  document.getElementById('react-container')
)
