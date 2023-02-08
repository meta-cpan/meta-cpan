DESCRIPTION = "This module allows you to run a subprocess and redirect stdin, stdout, \
and/or stderr to files and perl data structures. It aims to satisfy 99% of \
the need for using "system", "qx", and "open3" with a simple, extremely \
Perlish API."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later | BSD-2-Clause"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IPC-Run3"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=cb641bc04cda31daea161b1bc15da69f"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/IPC-Run3-0.048.tar.gz"

SRC_URI[md5sum] = "5a8cec571c51a118b265cf6e24e55761"
SRC_URI[sha256sum] = "3d81c3cc1b5cff69cca9361e2c6e38df0352251ae7b41e2ff3febc850e463565"

S = "${WORKDIR}/IPC-Run3-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
