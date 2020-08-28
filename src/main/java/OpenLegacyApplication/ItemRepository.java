// Shoham Hoffman Haik
// 206990269

package OpenLegacyApplication;

import org.springframework.data.jpa.repository.JpaRepository;

// This class gives the abilty to use methods such as "findById" instead of using SQL.
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
