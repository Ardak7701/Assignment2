import java.sql.*;

public class AnimalDAO {
    public void addAnimal(Animal animal) {
        String sql = "INSERT INTO animals (name, age, type, mane_length, trunk_length) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, animal.getName());
            ps.setInt(2, animal.getAge());

            if (animal instanceof Lion lion) {
                ps.setString(3, "LION");
                ps.setDouble(4, lion.getManeLength());
                ps.setNull(5, Types.DOUBLE);

            } else if (animal instanceof Elephant elephant) {
                ps.setString(3, "ELEPHANT");
                ps.setNull(4, Types.DOUBLE);
                ps.setDouble(5, elephant.getTrunkLength());
            }

            ps.executeUpdate();
            System.out.println("Animal added to database");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getAllAnimals() {
        String sql = "SELECT * FROM animals";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getString("type")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateAnimal(int id, int newAge) {
        String sql = "UPDATE animals SET age = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, newAge);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Animal updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteAnimal(int id) {
        String sql = "DELETE FROM animals WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Animal deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
