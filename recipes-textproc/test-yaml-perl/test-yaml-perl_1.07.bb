DESCRIPTION = "Test::YAML is a subclass of Test::Base with YAML specific support."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/Test-YAML-1.07.tar.gz"

SRC_URI[md5sum] = "6fe89b0144ffb5913fc4b021a80578b4"
SRC_URI[sha256sum] = "1f300d034f46298cb92960912cc04bac33fb27f05b8852d8f051e110b9cd995f"
RDEPENDS_${PN} += "test-base-perl"

S = "${WORKDIR}/Test-YAML-${PV}"

inherit cpan allarch

do_install_append() {
    rm -f ${D}/${bindir}/test-yaml
    rmdir ${D}/${bindir}
}

BBCLASSEXTEND = "native"
