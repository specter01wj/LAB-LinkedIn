//
//  ViewController.swift
//  Navigation
//
//  Created by LDC on 2/23/16.
//  Copyright © 2016 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        let detail:DetailController = segue.destinationViewController as! DetailController
        if segue.identifier == "optionA" {
            detail.text = "option a"
        }
        else if segue.identifier == "optionB" {
            detail.text = "option b"
        }
        else {
            detail.text = "option c"
        }
    }
}

