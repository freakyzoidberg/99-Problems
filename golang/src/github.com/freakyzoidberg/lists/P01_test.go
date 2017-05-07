package lists

import (
	"github.com/bmizerany/assert"
	"github.com/freakyzoidberg/test_utils"
	"testing"
)

func TestP1(t *testing.T) {
	res1, err := Last([]interface{}{1, 2, 3, 4, 5, 6, 7, 8})
	test_utils.HandleErr(t, err)
	assert.Equal(t, res1, 8)
	res2, err := Last([]interface{}{1})
	assert.Equal(t, res2, 1)
}
