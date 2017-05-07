package test_utils

import "testing"

func HandleErr(t *testing.T, err error) {
	if err != nil {
		t.Error(err.Error())
	}
}
