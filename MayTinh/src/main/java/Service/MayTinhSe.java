package Service;
import Model.MayTinh;
import DAO.MayTinhs;
import java.util.List;
public class MayTinhSe {
	public static List<MayTinh> getAllMayTinhs() {
		
		return MayTinhs.getAll();
	}

}
