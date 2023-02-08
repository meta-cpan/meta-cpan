DESCRIPTION = "Hashes are great for storing named data, but if you want more than one \
entry for a name, you have to use a list of pairs. Even then, this is \
really boring to write:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-OptList"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Data-OptList-0.112.tar.gz"

SRC_URI[md5sum] = "3b2cdb7846391f9acaf4e948a9a6b21b"
SRC_URI[sha256sum] = "62c60ccaae88d5339ae36bcc8940b03388cf84adbf27828b1f8b300307103bab"
RDEPENDS:${PN} += "params-util-perl"
RDEPENDS:${PN} += "sub-install-perl"

S = "${WORKDIR}/Data-OptList-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
