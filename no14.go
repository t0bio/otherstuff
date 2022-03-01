package main

func longestCommonPrefix(strs []string) string {
	s := strs[0]
	if len(strs) == 1 {
		return strs[0]
	}
	for i := 0; i < len(s); i++ {
		for _, j := range strs {
			if i >= len(j) || j[i] != s[i] {
				return s[:i]
			}
		}
	}
	return s
}
