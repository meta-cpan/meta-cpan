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

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JV/JV/Getopt-Long-2.48.tar.gz"

SRC_URI[md5sum] = "7dc6a38df7162a5add8f174a94acc0c3"
SRC_URI[sha256sum] = "d5852a2f526535d14af7c5428098d74bae26c71f7b0aa72e5736db174b9d755b"

S = "${WORKDIR}/Getopt-Long-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
