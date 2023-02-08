DESCRIPTION = "The Getopt::Long module implements an extended getopt function called \
GetOptions(). It parses the command line from @ARGV, recognizing and \
removing specified options and their possible values."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Getopt-Long"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JV/JV/Getopt-Long-2.52.tar.gz"

SRC_URI[md5sum] = "0298636f2743fcff8198eeff1c8248e2"
SRC_URI[sha256sum] = "9dc7a7c373353d5c05efae548e7b123aa8a31d1f506eb8dbbec8f0dca77705fa"

S = "${WORKDIR}/Getopt-Long-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
