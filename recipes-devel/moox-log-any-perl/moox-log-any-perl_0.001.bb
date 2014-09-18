DESCRIPTION = "A logging role building a very lightweight wrapper to Log::Any for use \
with your Moo or Moose classes. Connectibng a Log::Any::Adapter should \
be \
performed prior to logging the first log message, otherwise nothing \
will \
happen, just like with Log::Any"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Log-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CA/CAZADOR/MooX-Log-Any-0.001.tar.gz"

SRC_URI[md5sum] = "65b6096b1dc55df95ae24c6619f369f7"
SRC_URI[sha256sum] = "7834da28e46240ac82ef20916daf05c5780f5f721362c43b8e59136da1bf3623"
RDEPENDS_${PN} += "log-any-perl"
RDEPENDS_${PN} += "moo-perl"

S = "${WORKDIR}/MooX-Log-Any-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
