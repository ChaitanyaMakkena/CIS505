
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoComposerDao implements ComposerDao {

	private List<Composer> composers;
	
	public MemoComposerDao() {
		
		initData();
		
	}

	private void initData() {
		Composer composer1 = new Composer();
		composer1.setId(1007);
		composer1.setName("Ilayaraja");
		composer1.setGenre("Classical");
		
		Composer composer2 = new Composer();
		composer2.setId(1008);
		composer2.setName("Devi Sri");
		composer2.setGenre("Classical");
		
		Composer composer3 = new Composer();
		composer3.setId(1009);
		composer3.setName("Thaman");
		composer3.setGenre("Classical");
		
		Composer composer4 = new Composer();
		composer4.setId(1010);
		composer4.setName("ManiSharma");
		composer4.setGenre("Classical");
		
		Composer composer5 = new Composer();
		composer5.setId(1011);
		composer5.setName("Anirudh");
		composer5.setGenre("Classical");
		ArrayList<Composer> data = new ArrayList<>();
		data.add(composer1);
		data.add(composer2);
		data.add(composer3);
		data.add(composer4);
		data.add(composer5);
		this.composers = data;
	}

	@Override
	public List<Composer> findAll() {
		
		return composers;
	}

	@Override
	public Composer findBy(Integer key) {
		
		return this.composers.stream().filter(composer -> composer.getId() == key ).findAny().orElse(null);
				
	}

	@Override
	public void insert(Composer entity) {
		this.composers.add(entity);
		
	}
}
