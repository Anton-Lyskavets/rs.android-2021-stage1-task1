package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
//        throw NotImplementedError("Not implemented")
        val result = ArrayList<String>()
        var a = 0
        for (i in 0 until inputString.length) {
            if (inputString[i] == '<') {
                var j = i + 1
                while (true) {
                    if (inputString[j] == '>') {
                        if (a == 0) {
                            break
                        } else {
                            a -= 1
                            j += 1
                            continue
                        }
                    }
                    if (inputString[j] == '<') {
                        a += 1
                        j += 1
                        continue
                    }
                    j += 1
                }
                result.add(inputString.substring(i + 1, j))
            }
            if (inputString[i] == '(') {
                var j = i + 1
                while (true) {
                    if (inputString[j] == ')') {
                        if (a == 0) {
                            break
                        } else {
                            a -= 1
                            j += 1
                            continue
                        }
                    }
                    if (inputString[j] == '(') {
                        a += 1
                        j += 1
                        continue
                    }
                    j += 1
                }
                result.add(inputString.substring(i + 1, j))
            }
            if (inputString[i] == '[') {
                var j = i + 1
                while (true) {
                    if (inputString[j] == ']') {
                        if (a == 0) {
                            break
                        } else {
                            a -= 1
                            j += 1
                            continue
                        }
                    }
                    if (inputString[j] == '[') {
                        a += 1
                        j += 1
                        continue
                    }
                    j += 1
                }
                result.add(inputString.substring(i + 1, j))
            }
        }
        return result.toTypedArray()
    }
}
