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

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JV/JV/Getopt-Long-2.46.tar.gz"

SRC_URI[md5sum] = "0bcbf60153bfd4c2de6ac59bb7c81d99"
SRC_URI[sha256sum] = "85fde3a74d23d3898456e14452615b73cd95e4f88ea284602d8698da68607712"

S = "${WORKDIR}/Getopt-Long-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
