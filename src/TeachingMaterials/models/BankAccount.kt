package TeachingMaterials.models

class BankAccount(var balance: Int) {
    fun deposit(amount: Int) {
        balance += amount
    }
}
