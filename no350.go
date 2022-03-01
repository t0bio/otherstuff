package main

func intersect(nums1 []int, nums2 []int) []int {
	m := make(map[int]int)
	//count := 0

	small, larger := nums1, nums2
	if len(nums1) > len(nums2) {
		small, larger = nums2, nums1
	}

	for i := 0; i < len(small); i++ {
		m[small[i]]++
		//count = 0
	}
	arr := make([]int, 0)
	for j := 0; j < len(larger); j++ {
		if _, ok := m[larger[j]]; ok {
			arr = append(arr, larger[j])
			if m[larger[j]]-1 == 0 {
				delete(m, larger[j])
			} else {
				m[larger[j]]--
			}
		}
	}
	//arr := make([]int)
	return arr
}
