DESCRIPTION = "The Getopt::Long module implements an extended getopt function called \
GetOptions(). It parses the command line from @ARGV, recognizing and \
removing specified options and their possible values."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Getopt-Long"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JV/JV/Getopt-Long-2.50.tar.gz"

SRC_URI[md5sum] = "c4824b8a135be64f1e09df8ebb2391a9"
SRC_URI[sha256sum] = "20881adb2b73e83825f9a0a3b141db11b3a555e1d3775b13d81d0481623e4b67"

S = "${WORKDIR}/Getopt-Long-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
