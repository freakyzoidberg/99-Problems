package lists

import (
	"github.com/freakyzoidberg/common"
)

func LastAndPenultimate(list []interface{}) ([]interface{}, error) {
	length, err := common.GetListLen(list)
	if err != nil {
		return nil, err
	}
	switch length {
	case 1:
		fallthrough
	case 2:
		return list, nil
	default:
		return list[length-2:], nil
	}
}
