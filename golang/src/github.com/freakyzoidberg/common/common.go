package common

type Error struct {
	Msg string
}

func (err Error) Error() string {
	return err.Msg
}

func GetListLen(list []interface{}) (int, error) {
	if list == nil {
		return 0, Error{Msg: "list is nil"}
	}
	len := len(list)
	if len == 0 {
		return 0, Error{Msg: "list is empty"}
	}
	return len, nil
}
