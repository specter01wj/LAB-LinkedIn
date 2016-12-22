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
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        if (2 < 1 || 1 == 1) {
            label.text = "statement is true"
        }
        else {
            label.text = "statement is false"
        }
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

