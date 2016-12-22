//
//  ViewController.swift
//  Tables
//
//  Created by LDC on 2/19/16.
//  Copyright © 2016 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITableViewDataSource {

    let data:[String] = ["Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let cell = UITableViewCell()
        cell.textLabel?.text = data[indexPath.row]
        return cell
    }
    
    func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return data.count
    }
}

