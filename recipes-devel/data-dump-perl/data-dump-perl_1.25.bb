DESCRIPTION = "This module provides a few functions that traverse their argument list and \
return a string containing Perl code that, when "eval"ed, produces a deep \
copy of the original arguments."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Dump"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GARU/Data-Dump-1.25.tar.gz"

SRC_URI[md5sum] = "9bd7131ef0441e1e0e001bf85e9fae31"
SRC_URI[sha256sum] = "a4aa6e0ddbf39d5ad49bddfe0f89d9da864e3bc00f627125d1bc580472f53fbd"

S = "${WORKDIR}/Data-Dump-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
