#include <iostream>
using namespace std;
int main() {
static double totalAmount;
const double salesTax = 0.05;
int itemPrice, itemQuant,finalAmount, beforeTax, tax; 
cout <<"Enter item price: ";
cin >> itemPrice;
cout <<"Enter item quantity: ";
cin >> itemQuant;
beforeTax = (itemPrice)*(itemQuant);
tax = beforeTax * salesTax;
totalAmount = beforeTax + tax;
cout << "The final amount is: "<< totalAmount;
return 0;
}
