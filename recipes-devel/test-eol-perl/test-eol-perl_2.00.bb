DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of windows line endings."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-EOL"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-EOL-2.00.tar.gz"

SRC_URI[md5sum] = "4278fac962b1015b7c92d8d55dc3f929"
SRC_URI[sha256sum] = "8e7f7e5d07d3be0f1d7d51bcda8af0962767eb2897fd48994df274c0f5ed6b50"

S = "${WORKDIR}/Test-EOL-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
