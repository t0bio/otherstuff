package main

import "fmt"

func countOdds(low int, high int) []int {
	var nums []int
	for i := low; i <= high; i++ {
		if i%2 != 0 {
			nums = append(nums, i)
		}
	}
	return nums
}
func main() {
	fmt.Println(countOdds(1, 10))
}
