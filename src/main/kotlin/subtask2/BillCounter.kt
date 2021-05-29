package subtask2

class BillCounter {

    // TODO: Complete the following function
// The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
//        throw NotImplementedError("Not implemented")
        val x = bill[k]
        var summ = 0
        var debt = 0
        val fairlySplit = "bon appetit"
        for (i in bill.indices) {
            summ += bill[i]
        }
        if ((summ - x) / 2 >= b) {
            return (fairlySplit)
        } else {
            debt = b - (summ - x) / 2
            return (Integer.toString(debt))
        }
    }
}
