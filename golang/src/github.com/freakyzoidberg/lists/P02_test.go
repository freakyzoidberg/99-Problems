package lists

import (
	"github.com/bmizerany/assert"
	"github.com/freakyzoidberg/test_utils"
	"testing"
)

func TestP2(t *testing.T) {
	res1, err := LastAndPenultimate([]interface{}{1, 2, 3, 4, 5, 6, 7, 8})
	test_utils.HandleErr(t, err)
	assert.Equal(t, res1, []interface{}{7, 8})
	res2, err := LastAndPenultimate([]interface{}{1})
	assert.Equal(t, res2, []interface{}{1})
}
