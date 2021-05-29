package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
//        throw NotImplementedError("Not implemented")
        val happyArray = ArrayList<Int>()
        for (i in sadArray.indices) {
            happyArray.add(sadArray[i])
        }

        return happyArray(happyArray)
    }

    fun happyArray(happyArray: ArrayList<Int>): IntArray {
        var count = 0
        var x = 0
        for (j in 0 until happyArray.size - 2) {
            if (happyArray[j + 1] >= happyArray[j] + happyArray[j + 2]) {
                x = happyArray[j + 1]
                count += 1
                break
            }
        }
        for (i in happyArray.indices) {
            if (x == happyArray[i]) {
                happyArray.removeAt(i)
                break
            }
        }
        return if (count == 0) {
            return happyArray.toIntArray()
        } else happyArray(happyArray)
    }
}
