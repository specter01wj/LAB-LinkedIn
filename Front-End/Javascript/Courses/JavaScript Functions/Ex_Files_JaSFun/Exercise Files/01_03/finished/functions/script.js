function plus(a,b) {
  return (
    console.log(a+b),
    console.log(this),
    console.log(arguments)
  )
}

plus(2,2)