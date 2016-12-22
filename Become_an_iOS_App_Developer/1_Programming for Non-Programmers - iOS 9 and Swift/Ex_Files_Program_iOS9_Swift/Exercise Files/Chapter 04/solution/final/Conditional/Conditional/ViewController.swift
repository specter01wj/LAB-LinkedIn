//
//  ViewController.swift
//  Conditional
//
//  Created by LDC on 10/13/15.
//  Copyright © 2015 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var label: UILabel!
    var isOn:Bool = false
    
    @IBAction func didClickButton(sender: AnyObject) {
        if isOn == false {
            isOn = true
            label.text = "On"
        }
        else {
            isOn = false
            label.text = "Off"
        }
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

