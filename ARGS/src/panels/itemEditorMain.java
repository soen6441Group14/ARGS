package panels;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import mainClasses.item;

/**
 *
 * @author SNaKeRUBIN
 */
public class itemEditorMain extends javax.swing.JPanel {

    String[] choices = {"abc", "def"};
    CardLayout cardlayout;
    ArrayList<item> helmetArrayList = new ArrayList<item>();
    ArrayList<item> weaponArrayList = new ArrayList<item>();
    ArrayList<item> shieldArrayList = new ArrayList<item>();
    ArrayList<item> armorArrayList = new ArrayList<item>();
    ArrayList<item> ringArrayList = new ArrayList<item>();
    ArrayList<item> beltArrayList = new ArrayList<item>();
    ArrayList<item> bootArrayList = new ArrayList<item>();
    HashMap<String, ArrayList<item>> hashmap = new HashMap<>();
    
    /**
     * Creates new form itemEditorMain
     */
    
    public itemEditorMain() {

        initComponents();
        DisplayPanel.setVisible(false);
        combobox_type.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                myBox(evt);
            }
        });
        cardlayout = (CardLayout) panel_itemType.getLayout();
        //String[] choices = {"abc", "abc"};
    }

    protected void myBox(ActionEvent evt) {
        if (combobox_type.getSelectedItem().equals("Helmet")) {
            panel_itemType.setVisible(true);
            cardlayout.show(panel_itemType, "card4");
        }
        if (combobox_type.getSelectedItem().equals("Weapon")) {
            panel_itemType.setVisible(true);
            cardlayout.show(panel_itemType, "card2");
        }
        if (combobox_type.getSelectedItem().equals("Shield")) {
            panel_itemType.setVisible(true);
            cardlayout.show(panel_itemType, "card3");
        }
        if (combobox_type.getSelectedItem().equals("Armor")) {
            panel_itemType.setVisible(true);
            cardlayout.show(panel_itemType, "card5");
        }
        if (combobox_type.getSelectedItem().equals("Belt")) {
            panel_itemType.setVisible(true);
            cardlayout.show(panel_itemType, "card7");
        }
        if (combobox_type.getSelectedItem().equals("Ring")) {
            panel_itemType.setVisible(true);
            cardlayout.show(panel_itemType, "card8");
        }
        if (combobox_type.getSelectedItem().equals("Boots")) {
            panel_itemType.setVisible(true);
            cardlayout.show(panel_itemType, "card6");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ControlPanel = new javax.swing.JPanel();
        button_new = new javax.swing.JButton();
        button_edit = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        DisplayPanel = new javax.swing.JPanel();
        label_name = new javax.swing.JLabel();
        textfield_name = new javax.swing.JTextField();
        label_type = new javax.swing.JLabel();
        combobox_type = new javax.swing.JComboBox<>();
        panel_itemType = new javax.swing.JPanel();
        panel_type_weapon = new javax.swing.JPanel();
        label_weapon_atk_bns = new javax.swing.JLabel();
        label_weapon_dmg_bns = new javax.swing.JLabel();
        textfield_weapon_atk_bns = new javax.swing.JTextField();
        textfield_weapon_dmg_bns = new javax.swing.JTextField();
        panel_type_shield = new javax.swing.JPanel();
        label_shield_arm_cls = new javax.swing.JLabel();
        textfield_shield_arm_cls = new javax.swing.JTextField();
        panel_type_helmet = new javax.swing.JPanel();
        label_helmet_int_bns = new javax.swing.JLabel();
        label_helmet_wis_bns = new javax.swing.JLabel();
        lable_helmet_arm_cls = new javax.swing.JLabel();
        textfield_helmet_int_bns = new javax.swing.JTextField();
        textfield_helmet_wis_bns = new javax.swing.JTextField();
        textfield_helmet_arm_cls = new javax.swing.JTextField();
        panel_type_armor = new javax.swing.JPanel();
        label_armor_arm_cls = new javax.swing.JLabel();
        textfield_armor_arm_cls = new javax.swing.JTextField();
        panel_type_boots = new javax.swing.JPanel();
        label_boots_arm_cls = new javax.swing.JLabel();
        label_boots_dex_bns = new javax.swing.JLabel();
        textfield_boots_arm_cls = new javax.swing.JTextField();
        textfield_boots_dex_bns = new javax.swing.JTextField();
        panel_type_belt = new javax.swing.JPanel();
        label_belt_cns_bns = new javax.swing.JLabel();
        label_belt_str_bns = new javax.swing.JLabel();
        textfield_belt_cns_bns = new javax.swing.JTextField();
        textfield_belt_str_bns = new javax.swing.JTextField();
        panel_type_ring = new javax.swing.JPanel();
        label_ring_arm_cls = new javax.swing.JLabel();
        label_ring_str_bns = new javax.swing.JLabel();
        label_ring_cns_bns = new javax.swing.JLabel();
        label_ring_wis_bns = new javax.swing.JLabel();
        label_ring_cra_bns = new javax.swing.JLabel();
        textfield_ring_arm_cls = new javax.swing.JTextField();
        textfield_ring_str_bns = new javax.swing.JTextField();
        textfield_ring_cns_bns = new javax.swing.JTextField();
        textfield_ring_wis_bns = new javax.swing.JTextField();
        textfield_ring_cra_bns = new javax.swing.JTextField();

        button_new.setText("New");
        button_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newActionPerformed(evt);
            }
        });

        button_edit.setText("Edit");
        button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editActionPerformed(evt);
            }
        });

        button_delete.setText(" Delete");

        button_save.setText("Save");
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(button_new)
                .addGap(40, 40, 40)
                .addComponent(button_edit)
                .addGap(191, 191, 191)
                .addComponent(button_save)
                .addGap(57, 57, 57)
                .addComponent(button_delete)
                .addContainerGap(717, Short.MAX_VALUE))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_new)
                    .addComponent(button_edit)
                    .addComponent(button_delete)
                    .addComponent(button_save))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        label_name.setText("Name");

        textfield_name.setText("jTextField1");

        label_type.setText("Type");

        combobox_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Helmet", "Weapon", "Shield", "Armor", "Belt", "Ring", "Boots" }));

        panel_itemType.setLayout(new java.awt.CardLayout());

        label_weapon_atk_bns.setText("Attack Bonus");

        label_weapon_dmg_bns.setText("Damage Bonus");

        textfield_weapon_atk_bns.setText("jTextField1");

        textfield_weapon_dmg_bns.setText("jTextField2");

        javax.swing.GroupLayout panel_type_weaponLayout = new javax.swing.GroupLayout(panel_type_weapon);
        panel_type_weapon.setLayout(panel_type_weaponLayout);
        panel_type_weaponLayout.setHorizontalGroup(
            panel_type_weaponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_weaponLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(panel_type_weaponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_weapon_atk_bns)
                    .addComponent(label_weapon_dmg_bns))
                .addGap(55, 55, 55)
                .addGroup(panel_type_weaponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfield_weapon_dmg_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_weapon_atk_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        panel_type_weaponLayout.setVerticalGroup(
            panel_type_weaponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_weaponLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panel_type_weaponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_weapon_atk_bns)
                    .addComponent(textfield_weapon_atk_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panel_type_weaponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_weapon_dmg_bns)
                    .addComponent(textfield_weapon_dmg_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        panel_itemType.add(panel_type_weapon, "card2");

        label_shield_arm_cls.setText("Armor Class");

        textfield_shield_arm_cls.setText("jTextField1");

        javax.swing.GroupLayout panel_type_shieldLayout = new javax.swing.GroupLayout(panel_type_shield);
        panel_type_shield.setLayout(panel_type_shieldLayout);
        panel_type_shieldLayout.setHorizontalGroup(
            panel_type_shieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_shieldLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(label_shield_arm_cls)
                .addGap(71, 71, 71)
                .addComponent(textfield_shield_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        panel_type_shieldLayout.setVerticalGroup(
            panel_type_shieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_shieldLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panel_type_shieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_shield_arm_cls)
                    .addComponent(textfield_shield_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        panel_itemType.add(panel_type_shield, "card3");

        label_helmet_int_bns.setText("Intelligence Bonus");

        label_helmet_wis_bns.setText("Wisdom Bonus");

        lable_helmet_arm_cls.setText("Armor Class");

        textfield_helmet_int_bns.setText("jTextField1");

        textfield_helmet_wis_bns.setText("jTextField2");

        textfield_helmet_arm_cls.setText("jTextField3");

        javax.swing.GroupLayout panel_type_helmetLayout = new javax.swing.GroupLayout(panel_type_helmet);
        panel_type_helmet.setLayout(panel_type_helmetLayout);
        panel_type_helmetLayout.setHorizontalGroup(
            panel_type_helmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_helmetLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(panel_type_helmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_type_helmetLayout.createSequentialGroup()
                        .addComponent(lable_helmet_arm_cls)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfield_helmet_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_type_helmetLayout.createSequentialGroup()
                        .addComponent(label_helmet_wis_bns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfield_helmet_wis_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_type_helmetLayout.createSequentialGroup()
                        .addComponent(label_helmet_int_bns)
                        .addGap(78, 78, 78)
                        .addComponent(textfield_helmet_int_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        panel_type_helmetLayout.setVerticalGroup(
            panel_type_helmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_helmetLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(panel_type_helmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_helmet_int_bns)
                    .addComponent(textfield_helmet_int_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel_type_helmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_helmet_wis_bns)
                    .addComponent(textfield_helmet_wis_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_type_helmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable_helmet_arm_cls)
                    .addComponent(textfield_helmet_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        panel_itemType.add(panel_type_helmet, "card4");

        label_armor_arm_cls.setText(" Armor Class");

        textfield_armor_arm_cls.setText("jTextField1");

        javax.swing.GroupLayout panel_type_armorLayout = new javax.swing.GroupLayout(panel_type_armor);
        panel_type_armor.setLayout(panel_type_armorLayout);
        panel_type_armorLayout.setHorizontalGroup(
            panel_type_armorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_armorLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(label_armor_arm_cls)
                .addGap(72, 72, 72)
                .addComponent(textfield_armor_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panel_type_armorLayout.setVerticalGroup(
            panel_type_armorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_armorLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(panel_type_armorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_armor_arm_cls)
                    .addComponent(textfield_armor_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        panel_itemType.add(panel_type_armor, "card5");

        label_boots_arm_cls.setText("Armor Class");

        label_boots_dex_bns.setText("Dexterity");

        textfield_boots_arm_cls.setText("jTextField1");

        textfield_boots_dex_bns.setText("jTextField2");

        javax.swing.GroupLayout panel_type_bootsLayout = new javax.swing.GroupLayout(panel_type_boots);
        panel_type_boots.setLayout(panel_type_bootsLayout);
        panel_type_bootsLayout.setHorizontalGroup(
            panel_type_bootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_bootsLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(panel_type_bootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_boots_arm_cls)
                    .addComponent(label_boots_dex_bns))
                .addGap(69, 69, 69)
                .addGroup(panel_type_bootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfield_boots_dex_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_boots_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panel_type_bootsLayout.setVerticalGroup(
            panel_type_bootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_bootsLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(panel_type_bootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_boots_arm_cls)
                    .addComponent(textfield_boots_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panel_type_bootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_boots_dex_bns)
                    .addComponent(textfield_boots_dex_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        panel_itemType.add(panel_type_boots, "card6");

        label_belt_cns_bns.setText("Constitution");

        label_belt_str_bns.setText("Strength");

        textfield_belt_cns_bns.setText("jTextField1");

        textfield_belt_str_bns.setText("jTextField2");

        javax.swing.GroupLayout panel_type_beltLayout = new javax.swing.GroupLayout(panel_type_belt);
        panel_type_belt.setLayout(panel_type_beltLayout);
        panel_type_beltLayout.setHorizontalGroup(
            panel_type_beltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_beltLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(panel_type_beltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_type_beltLayout.createSequentialGroup()
                        .addComponent(label_belt_str_bns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfield_belt_str_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_type_beltLayout.createSequentialGroup()
                        .addComponent(label_belt_cns_bns)
                        .addGap(30, 30, 30)
                        .addComponent(textfield_belt_cns_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        panel_type_beltLayout.setVerticalGroup(
            panel_type_beltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_beltLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(panel_type_beltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_belt_cns_bns)
                    .addComponent(textfield_belt_cns_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(panel_type_beltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_belt_str_bns)
                    .addComponent(textfield_belt_str_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        panel_itemType.add(panel_type_belt, "card7");

        label_ring_arm_cls.setText("Armor Class");

        label_ring_str_bns.setText("Strength");

        label_ring_cns_bns.setText("Constitution");

        label_ring_wis_bns.setText("Wisdom");

        label_ring_cra_bns.setText("Charisma");

        textfield_ring_arm_cls.setText("jTextField1");

        textfield_ring_str_bns.setText("jTextField2");

        textfield_ring_cns_bns.setText("jTextField3");

        textfield_ring_wis_bns.setText("jTextField4");

        textfield_ring_cra_bns.setText("jTextField5");

        javax.swing.GroupLayout panel_type_ringLayout = new javax.swing.GroupLayout(panel_type_ring);
        panel_type_ring.setLayout(panel_type_ringLayout);
        panel_type_ringLayout.setHorizontalGroup(
            panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_ringLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_type_ringLayout.createSequentialGroup()
                        .addComponent(label_ring_cra_bns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfield_ring_cra_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_type_ringLayout.createSequentialGroup()
                        .addComponent(label_ring_wis_bns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfield_ring_wis_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_type_ringLayout.createSequentialGroup()
                        .addComponent(label_ring_cns_bns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfield_ring_cns_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_type_ringLayout.createSequentialGroup()
                        .addComponent(label_ring_str_bns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfield_ring_str_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_type_ringLayout.createSequentialGroup()
                        .addComponent(label_ring_arm_cls)
                        .addGap(52, 52, 52)
                        .addComponent(textfield_ring_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        panel_type_ringLayout.setVerticalGroup(
            panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_type_ringLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_ring_arm_cls)
                    .addComponent(textfield_ring_arm_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ring_str_bns)
                    .addComponent(textfield_ring_str_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ring_cns_bns)
                    .addComponent(textfield_ring_cns_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ring_wis_bns)
                    .addComponent(textfield_ring_wis_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panel_type_ringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ring_cra_bns)
                    .addComponent(textfield_ring_cra_bns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        panel_itemType.add(panel_type_ring, "card8");

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DisplayPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_type)
                            .addComponent(label_name))
                        .addGap(52, 52, 52)
                        .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DisplayPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(panel_itemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(761, Short.MAX_VALUE))
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_name)
                    .addComponent(textfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_type)
                    .addComponent(combobox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(panel_itemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editActionPerformed
        String input = (String) JOptionPane.showInputDialog(null, "Choose item to edit", "Item Select", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        DisplayPanel.setVisible(true);
        panel_itemType.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_button_editActionPerformed

    private void button_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newActionPerformed
        DisplayPanel.setVisible(true);
        panel_itemType.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_button_newActionPerformed

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        // TODO add your handling code here:
        if (combobox_type.getSelectedItem().equals("Helmet")) {
           helmetArrayList.add(new item(textfield_name.getName(),Integer.parseInt(label_helmet_int_bns.getName())));
           hashmap.put("Helmet", helmetArrayList);
        }
        if (combobox_type.getSelectedItem().equals("Weapon")) {
           weaponArrayList.add(new item(textfield_name.getName(),Integer.parseInt(textfield_weapon_dmg_bns.getName())));
           hashmap.put("Weapon", weaponArrayList);
        }
        if (combobox_type.getSelectedItem().equals("Shield")) {
            shieldArrayList.add(new item(textfield_name.getName(),Integer.parseInt(textfield_shield_arm_cls.getName())));
            hashmap.put("Shield", shieldArrayList);
        }
        if (combobox_type.getSelectedItem().equals("Armor")) {
          armorArrayList.add(new item(textfield_name.getName(),Integer.parseInt(textfield_armor_arm_cls.getName())));
          hashmap.put("Armor", armorArrayList);
        }
        if (combobox_type.getSelectedItem().equals("Belt")) {
            beltArrayList.add(new item(textfield_name.getName(),Integer.parseInt(textfield_belt_str_bns.getName())));
            hashmap.put("Belt", beltArrayList);
        }
        if (combobox_type.getSelectedItem().equals("Ring")) {
           ringArrayList.add(new item(textfield_name.getName(),Integer.parseInt(textfield_ring_wis_bns.getName())));
           hashmap.put("Ring", ringArrayList);
        }
        if (combobox_type.getSelectedItem().equals("Boots")) {
           bootArrayList.add(new item(textfield_name.getName(),Integer.parseInt(textfield_boots_dex_bns.getName())));
           hashmap.put("Boot", bootArrayList);
        }
        
    }//GEN-LAST:event_button_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_edit;
    private javax.swing.JButton button_new;
    private javax.swing.JButton button_save;
    private javax.swing.JComboBox<String> combobox_type;
    private javax.swing.JLabel label_armor_arm_cls;
    private javax.swing.JLabel label_belt_cns_bns;
    private javax.swing.JLabel label_belt_str_bns;
    private javax.swing.JLabel label_boots_arm_cls;
    private javax.swing.JLabel label_boots_dex_bns;
    private javax.swing.JLabel label_helmet_int_bns;
    private javax.swing.JLabel label_helmet_wis_bns;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_ring_arm_cls;
    private javax.swing.JLabel label_ring_cns_bns;
    private javax.swing.JLabel label_ring_cra_bns;
    private javax.swing.JLabel label_ring_str_bns;
    private javax.swing.JLabel label_ring_wis_bns;
    private javax.swing.JLabel label_shield_arm_cls;
    private javax.swing.JLabel label_type;
    private javax.swing.JLabel label_weapon_atk_bns;
    private javax.swing.JLabel label_weapon_dmg_bns;
    private javax.swing.JLabel lable_helmet_arm_cls;
    private javax.swing.JPanel panel_itemType;
    private javax.swing.JPanel panel_type_armor;
    private javax.swing.JPanel panel_type_belt;
    private javax.swing.JPanel panel_type_boots;
    private javax.swing.JPanel panel_type_helmet;
    private javax.swing.JPanel panel_type_ring;
    private javax.swing.JPanel panel_type_shield;
    private javax.swing.JPanel panel_type_weapon;
    private javax.swing.JTextField textfield_armor_arm_cls;
    private javax.swing.JTextField textfield_belt_cns_bns;
    private javax.swing.JTextField textfield_belt_str_bns;
    private javax.swing.JTextField textfield_boots_arm_cls;
    private javax.swing.JTextField textfield_boots_dex_bns;
    private javax.swing.JTextField textfield_helmet_arm_cls;
    private javax.swing.JTextField textfield_helmet_int_bns;
    private javax.swing.JTextField textfield_helmet_wis_bns;
    private javax.swing.JTextField textfield_name;
    private javax.swing.JTextField textfield_ring_arm_cls;
    private javax.swing.JTextField textfield_ring_cns_bns;
    private javax.swing.JTextField textfield_ring_cra_bns;
    private javax.swing.JTextField textfield_ring_str_bns;
    private javax.swing.JTextField textfield_ring_wis_bns;
    private javax.swing.JTextField textfield_shield_arm_cls;
    private javax.swing.JTextField textfield_weapon_atk_bns;
    private javax.swing.JTextField textfield_weapon_dmg_bns;
    // End of variables declaration//GEN-END:variables

}
