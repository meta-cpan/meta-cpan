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

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JV/JV/Getopt-Long-2.47.tar.gz"

SRC_URI[md5sum] = "08e7821f619664e996d7de30befb5bcd"
SRC_URI[sha256sum] = "f5e6633ccda3f56a2df7a29f4187f4c787be4b746d97e9eb4aabd3aec1d9ed7b"

S = "${WORKDIR}/Getopt-Long-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
