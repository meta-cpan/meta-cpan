DESCRIPTION = "Config::Any provides a facility for Perl applications and libraries to load \
configuration data from multiple different file formats. It supports XML, \
YAML, JSON, Apache-style configuration, Windows INI files, and even Perl \
code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Config-Any-0.32.tar.gz"

SRC_URI[md5sum] = "71151c8a35636610e8ed5ad29147b5ca"
SRC_URI[sha256sum] = "68da2a5cf25faedd4d24cf3d0d570995c199d5b950108a2de78d40deced36150"
RDEPENDS:${PN} += "module-pluggable-perl"

S = "${WORKDIR}/Config-Any-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
