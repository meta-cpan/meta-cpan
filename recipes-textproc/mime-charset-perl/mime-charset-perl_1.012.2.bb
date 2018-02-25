DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Charset"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEZUMI/MIME-Charset-1.012.2.tar.gz"

SRC_URI[md5sum] = "71440416376248c31aa3bef753fae28d"
SRC_URI[sha256sum] = "878c779c0256c591666bd06c0cde4c0d7820eeeb98fd1183082aee9a1e7b1d13"

S = "${WORKDIR}/MIME-Charset-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
