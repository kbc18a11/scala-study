object HelloWorld {
  def main(args: Array[String]): Unit = {
    val age: Int = 5
    val isSchoolStarted: Boolean = false

    if (1 <= age && age <= 6 && !isSchoolStarted) {
      return println("幼児です")
    }

    println("幼児ではありません")
  }
}
