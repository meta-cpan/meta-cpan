DESCRIPTION = "The Getopt::Long module implements an extended getopt \
function called GetOptions(). It parses the command line from @ARGV, \
recognizing and removing specified options and their possible values."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Getopt-Long"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JV/JV/Getopt-Long-2.45.tar.gz"

SRC_URI[md5sum] = "ea5c085b30915efe522f9ac58fcc343d"
SRC_URI[sha256sum] = "93fdea2b24130dd748cd1dd8579513a4d46965b2e9869cf47649ab5a66053af1"

S = "${WORKDIR}/Getopt-Long-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
