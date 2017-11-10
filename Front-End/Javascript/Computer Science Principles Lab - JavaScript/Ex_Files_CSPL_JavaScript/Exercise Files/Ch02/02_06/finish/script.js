// JavaScript Document

var subtotal = 15.00;

console.log("Subtotal: " + subtotal)

var total = subtotal + calculateTax(0.08, subtotal);

console.log("Total: " + total)

function calculateTax(taxRate, amountToTax)
{
    var tax = amountToTax * taxRate;
    console.log("Tax: " + tax);
    return tax;
}