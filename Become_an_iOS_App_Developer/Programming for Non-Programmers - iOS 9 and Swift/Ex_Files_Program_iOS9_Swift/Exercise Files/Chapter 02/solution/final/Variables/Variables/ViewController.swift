//
//  ViewController.swift
//  Variables
//
//  Created by LDC on 10/12/15.
//  Copyright © 2015 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var labelName: UILabel!
    @IBOutlet weak var labelAge: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        labelName.text = "Todd"
        labelAge.text = "\(5)"
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

