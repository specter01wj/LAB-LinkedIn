//
//  ViewController.swift
//  Basic Interaction
//
//  Created by LDC on 2/9/16.
//  Copyright © 2016 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBAction func buttonWasClicked(sender: AnyObject) {
        print("button clicked!");
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

