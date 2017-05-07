package lists

import (
	"github.com/freakyzoidberg/common"
)

func Last(list []interface{}) (interface{}, error) {
	length, err := common.GetListLen(list)
	if err != nil {
		return nil, err
	}
	switch length {
	case 1:
		return list[0], nil
	default:
		return list[length-1], nil
	}
}
