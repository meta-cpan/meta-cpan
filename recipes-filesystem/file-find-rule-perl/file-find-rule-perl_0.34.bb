DESCRIPTION = "File::Find::Rule is a friendlier interface to File::Find. It allows you to \
build rules which specify the desired files and directories."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Find-Rule"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RC/RCLAMP/File-Find-Rule-0.34.tar.gz"

SRC_URI[md5sum] = "a7aa9ad4d8ee87b2a77b8e3722768712"
SRC_URI[sha256sum] = "7e6f16cc33eb1f29ff25bee51d513f4b8a84947bbfa18edb2d3cc40a2d64cafe"
RDEPENDS:${PN} += "number-compare-perl"
RDEPENDS:${PN} += "text-glob-perl"

S = "${WORKDIR}/File-Find-Rule-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
